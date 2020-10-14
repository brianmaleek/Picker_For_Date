# Picker_For_Date

Using a picker for User input

Android provides ready-to-use dialogs, called pickers, for picking a time or a date. You can use them to ensure that your users pick a valid time or date that is formatted correctly and adjusted to the user's local time and date. Each picker provides controls for selecting each part of the time (hour, minute, AM/PM) or date (month, day, year).

Will learn how to use a fragment. Which is a behaviour or a portion of a UI within an Activity. Its like a mini Activity within the main Activity, with its own lifecycle, and its used for building a picker. 

One benefit of using a Fragment for a picker is that you can isolate the code sections for managing the date and the time for various locales that display date and time in different ways. 

The best practice to show a picker is to use an instance of DialogFragment, which is a subclass of Fragment. A DialogFragment displays a dialog window floating on top of the Activity window. In this exercise, you'll add a Fragment for the picker dialog and use DialogFragment to manage the dialog lifecycle.

