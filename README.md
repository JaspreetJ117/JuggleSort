# Juggle Sort Algorithm

## Overview
Juggle Sort is a custom sorting algorithm created as part of a class project. It was developed while the professor was teaching Merge Sort. Despite being an attempt to contribute something unique to the study of Data Structures and Algorithms, the algorithm didn't bring any "aura" or special recognition (though the effort was appreciated). It’s a simple yet inefficient sorting technique that can be improved with further optimization.

## Algorithm Description
The Juggle Sort algorithm works by finding the minimum and maximum elements in the list, removing them, and adding them to a new sorted list. These elements are then removed from the original list. This process repeats, effectively "juggling" the minimum and maximum elements back and forth until the entire list is sorted.

However, this approach is currently inefficient because it relies on repeatedly removing elements from the list, which can be costly. There’s room for improvement by using a single list and avoiding the use of the `remove` function, which would enhance the algorithm's performance.

### Why "Juggle Sort"?
The name "Juggle Sort" comes from the algorithm's process of repeatedly moving the minimum and maximum elements over and over again, similar to juggling. While it may not be the most efficient sorting method, it’s a creative, albeit impractical, approach.

### Performance Considerations
- The current implementation is **inefficient** due to the repeated removal of elements from the list, which could be costly in terms of time complexity.
- A more efficient version of this algorithm could be developed by working with a single list and using more optimized data structures.

## Humorous Backstory
The algorithm was born out of a mix of curiosity and the need to impress during a semester filled with the usual winter blues. While the goal was to create something notable in the world of algorithms, the result was more of an exercise in futility. If you're wondering what led to the creation of this sorting algorithm, rest assured—it was mostly the result of the winter semester struggles.

## Future Improvements
- Refactor to minimize the use of `remove()`, which can slow down the algorithm.
- Explore alternatives that do not involve repeatedly finding the minimum and maximum values.
- Optimize for better time complexity and reduce the number of iterations.

## License
Distributed under the MIT License. See `LICENSE` for more information.

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

## Author
- **Name:** Jaspreet Jawanda
- **Email:** [jawa3252@mylaurier.ca](mailto:jawa3252@mylaurier.ca), [Jaspreet4444@outlook.com](mailto:Jaspreet4444@outlook.com)
- **GitHub:** [sayanwala4](https://github.com/sayanwala4)
- **LinkedIn:** [jaspreet singh jawanda](https://www.linkedin.com/in/jaspreet-jawanda-559119308/)

## Contact
For further information or inquiries, please reach out to the author via the provided email addresses.