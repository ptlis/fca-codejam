#!/usr/bin/env bash
set -e

LAST_DATA=""
AFTER_DATA="$(cat ./data/chemtrail)"

while [ ${#LAST_DATA} != ${#AFTER_DATA} ]; do
  echo "called"
  LAST_DATA="$AFTER_DATA"
  AFTER_DATA="$(echo $LAST_DATA | sed -r 's/aA|bB|cC|dD|eE|fF|gG|hH|iI|jJ|kK|lL|mM|nN|oO|pP|qQ|rR|sS|tT|uU|vV|wW|xX|yY|zZ|Aa|Bb|Cc|Dd|Ee|Ff|Gg|Hh|Ii|Jj|Kk|Ll|Mm|Nn|Oo|Pp|Qq|Rr|Ss|Tt|Uu|Vv|Ww|Xx|Yy|Zz//g')"
done

echo "Count: ${#AFTER_DATA}"