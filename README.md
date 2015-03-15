# Android Lollipop Exercise

Android app to use as the base app for implementing the following material widgets and animations that were introduced in Android 5.0 (API level 21).

* RecyclerView (the new ListView)
* CardView (custom outline and shadow)
* Ripple animations (touch feedback)
* Palette (Incorporate dynamic color)
* Shared Element Activity Transition
* Floating Action Button

The app is composed of two screens. The first screen displays a list of contacts, in which, each item is described by the contact's avatar and name. Once a contact is selected from the list, a second screen appears with additional details about the contact, including his contact no. and a floating action button to place a phone call to this contact.

**Contact List**

**Contact Details**

## Overview

The app does the following:

1. It uses a `RecyclerView` to display a list of contacts.
2. `CardView` is used to display each contact in the list.
3. Adds ripple effect to `CardView` to provide touch feedback.
4. Uses `Palette` to add dynamic color to contact item's background. It also uses this color as the accent color for the views in details screen.
5. Adds shared element activity transition to provide a seamless experience by emphasizing continuity between activity transitions.
6. Adds a floating action button, clicking on which enables you to directly place a call to your contact.

## Libraries

This app leverages the following third-party library:

 * [Picasso](http://square.github.io/picasso/) - For remote image loading
