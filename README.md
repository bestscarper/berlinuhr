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

# UX

The implementation is deliberately simple as the requirements are vague about the UX.
The description of the clock includes the light colours, so it seems necessary to render
this in some way.

e.g. 11:31:00
Y
RR__
R___
YYRYYR______
Y___

# Demo

Run the App.main with a valid time to render the time appropriately
