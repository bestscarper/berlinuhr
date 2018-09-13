# Rubric

The top lamp blinks to show seconds - it is illuminated on even seconds and off on odd
seconds.

The next two rows represent hours. The upper row represents 5 hour blocks and is made up
of 4 red lamps. The lower row represents 1 hour blocks and is also made up of 4 red lamps.

The final two rows represent the minutes. The upper row represents 5 minute blocks, and is
made up of 11 lamps- every third lamp is red, the rest are yellow. The bottom row represents
1 minute blocks, and is made up of 4 yellow lamps.

# API

A single method 'fromDigital(<time>)' is available, which returns an array of ints
which represents the number of lights on each row from top to bottom.

e.g. 10:31:00 => [1,2,0,6,1]

# UX issues
The implementation is deliberately simple as the requirements are vague about the UX
but I assume a graphical depiction of the lights is beyond the scope of a simple coding test.

The output of the main function could be fed into a UX component to create a visual representation
of the clock, using JWT, or a bitmap-rendering library.
