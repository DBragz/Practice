#!/usr/bin/python

"""
    A widget class.
    Author: Daniel Ribeirinha-Braga
"""


class Widget:

    def __init__(self, name):
        self.name = name

    def say_name(self):
        print('Widget is ' + self.name)


def main():
    widget = Widget('DBrags')
    widget.say_name()


if __name__ == "__main__":
    main()
