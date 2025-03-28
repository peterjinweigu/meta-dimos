SUMMARY = "dimos"
DESCRIPTION = "dashboard"
AUTHOR = "UBC-FE"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "CLOSED"

SRCREV = "86f0da9fcfb0ed21ebced1db38adcd9d583078e0"
SRC_URI = "git://github.com/UBCFormulaElectric/Consolidated-Firmware/tree/dimos_flutter/software/dimos;lfs=0;branch=dimos_flutter;protocol=https;destsuffix=git"

S = "${UNPACKDIR}/git"

PUBSPEC_APPNAME = "dimos"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "dimos"
PUBSPEC_IGNORE_LOCKFILE = "1"
FLUTTER_APPLICATION_PATH = "software/dimos"

inherit flutter-app
