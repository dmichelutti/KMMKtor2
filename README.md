# KMMKtor2

This package is done with the purpose of testing KTOR2 features.
It contains a simple API call done with KTOR2, to retrieve a list of objects.

The main issue found is:
- Running the project (iOS) now is working great. The simple feature is to print a list of objects on the screen.
- In file iosApp/Podfile decomment line "#pod 'shared', :path => '../shared'" and reinstall pods. The goal is to make also testlib working with shared library.
- Now the same code (no other modifies needed to reproduce the crash) will crash on iOS app launch.
