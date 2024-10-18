# Code Jam 18th October 2024 "Opposites Attract (Violently)"

You know how it is; summer is over and you are preparing for all Hallows Eve.

As usual; it falls down to you for the special effects; and this year your determined to make that bubbling cauldron not just real looking; but some kind of self sustaining reaction. You’ve been to Boots and bought all the best chemicals you can lay your hands on as preparation.

Suddenly; disaster strikes ! You trip and spill your samples. For plot-line reasons; you must collect them in the order they are now laid out in; however whenever you add a chemical to your collection tube if it matches the kind; but not the polarity; of the last item you collected it will vanish. Given the elements are laid out in a specific order; how many will you have left at the end ?

Chemicals are designated by Aa-Zz where upper and lowercase denote polarity.

## Examples

Given a ChemTrail™ such as:

* In `aA`, `a` and `A` react, leaving nothing behind.
* In `abBA`, `bB` destroys itself, leaving `aA`. As above, this then destroys itself, leaving nothing.
* In `abAB`, no two adjacent units are of the same type, and so nothing happens.
* In `aabAAB`, even though aa and AA are of the same type, their polarities match, and so nothing happens.
* Given a much larger ChemTrail™ example `dabAcCaCBAcCcaDA`:
    * `dabAcCaCBAcCcaDA` The first `cC` is removed.
    * `dabAaCBAcCcaDA` This creates `Aa`, which is removed.
    * `dabCBAcCcaDA` Either `cC` or `Cc` are removed (the result is the same).
    * `dabCBAcaDA` No further actions can be taken.

After all reductions are made you are left with 10 chemicals.
