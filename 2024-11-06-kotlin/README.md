# Code Jam 6th November 2024 "Boarding Passes"

Christmas approaches; it’s time to grab a last minute holiday. You’ve scanned Teletext Holidays and found the deal of a lifetime ! You head out to the airport and as you rush to make the last boarding call you slide bowling-ball like into the other passengers awaiting your flight.

You’ve dropped your boarding pass; but realise you can probably find where you should be sat by a process of elimination. You remember you were somewhere in the middle of the plane; so surely as long as you can find a seating gap you should be in the clear.

Using your phone to scan all of the boarding passes held by other passengers you get a list of all the boarding codes. The boarding codes all use Binary Space Partitioning to indicate the seat location.

The first 7 characters will either be F or B; these specify exactly one of the 128 rows on the plane (numbered 0 through 127). Each letter tells you which half of a region the given seat is in. Start with the whole list of rows; the first letter indicates whether the seat is in the front (0 through 63) or the back (64 through 127). The next letter indicates which half of that region the seat is in, and so on until you're left with exactly one row.

## Examples

Consider just the first seven characters of FBFBBFFRLR:

* Start by considering the whole range, rows 0 through 127.
* F means to take the lower half, keeping rows 0 through 63.
* B means to take the upper half, keeping rows 32 through 63.
* F means to take the lower half, keeping rows 32 through 47.
* B means to take the upper half, keeping rows 40 through 47.
* B keeps rows 44 through 47.
* F keeps rows 44 through 45.
* The final F keeps the lower of the two, row 44.

Now, consider just the last 3 characters of FBFBBFFRLR:

Start by considering the whole range, columns 0 through 7.
R means to take the upper half, keeping columns 4 through 7.
L means to take the lower half, keeping columns 4 through 5.
The final R keeps the upper of the two, column 5.

So, decoding FBFBBFFRLR reveals that it is the seat at row 44, column 5.

Every seat also has a unique seat ID: multiply the row by 8, then add the column. In this example, the seat has ID 44 * 8 + 5 = 357.
