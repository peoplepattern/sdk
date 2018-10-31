find . -type f -print | grep 'jsonschema/.*.json' | while read line
do
  aws s3 cp $line s3://schemata.peoplepattern.com/;
done;
