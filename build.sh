#!/bin/bash
set -e

flutter build appbundle
flutter build ios --release --no-codesign