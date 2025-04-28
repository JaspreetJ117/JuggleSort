#include <stdio.h>
#include <stdlib.h>

/**
 * Find the minimum value in an array by comparing pairs from both ends.
 */
int find_min(int *arr, int len) {
    int min_val = arr[0];
    for (int i = 0; i <= len/2; ++i) {
        if (arr[i] < min_val) {
            min_val = arr[i];
        }
        int j = len - 1 - i;
        if (arr[j] < min_val) {
            min_val = arr[j];
        }
    }
    return min_val;
}

/**
 * Find the maximum value in an array by comparing pairs from both ends.
 */
int find_max(int *arr, int len) {
    int max_val = arr[0];
    for (int i = 0; i <= len/2; ++i) {
        if (arr[i] > max_val) {
            max_val = arr[i];
        }
        int j = len - 1 - i;
        if (arr[j] > max_val) {
            max_val = arr[j];
        }
    }
    return max_val;
}

/**
 * Juggle sort: repeatedly pluck out min and max from temp[],
 * place them into sorted[], then “remove” by shifting.
 * Returns a newly malloc’d sorted array of length n.
 */
int *juggle_sort(int *arr, int n) {
    int *temp   = malloc(n * sizeof *temp);
    int *sorted = malloc(n * sizeof *sorted);
    if (!temp || !sorted) {
        perror("malloc");
        exit(EXIT_FAILURE);
    }
    // copy original into temp[]
    for (int i = 0; i < n; ++i) {
        temp[i] = arr[i];
    }

    int current_len = n;
    int idx         = 0;

    while (current_len > 0) {
        int min_val = find_min(temp, current_len);
        int max_val = find_max(temp, current_len);

        // place into front/back of sorted[]
        sorted[idx]             = min_val;
        sorted[n - 1 - idx]     = max_val;
        idx++;

        // remove first occurrence of min_val
        int removed = 0;
        for (int i = 0; i < current_len; ++i) {
            if (!removed && temp[i] == min_val) {
                removed = 1;
                continue;
            }
            temp[i - removed] = temp[i];
        }
        current_len--;

        // if min and max are different, remove one max_val too
        if (min_val != max_val) {
            removed = 0;
            for (int i = 0; i < current_len; ++i) {
                if (!removed && temp[i] == max_val) {
                    removed = 1;
                    continue;
                }
                temp[i - removed] = temp[i];
            }
            current_len--;
        }
    }

    free(temp);
    return sorted;
}

int main(void) {
    int data[] = { 7, 2, 9, 4, 3, 8, 1, 5, 6 };
    int n = sizeof data / sizeof *data;

    int *result = juggle_sort(data, n);

    printf("Sorted: ");
    for (int i = 0; i < n; ++i) {
        printf("%d ", result[i]);
    }
    printf("\n");

    free(result);
    return 0;
}
