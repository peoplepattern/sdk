find . -type f -print | grep 'jsonschema/.*.json' | while read line
do
  mc cp $line db/schemata/;
done;
