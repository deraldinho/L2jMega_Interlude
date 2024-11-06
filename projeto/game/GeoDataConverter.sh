#! /bin/sh

java -Xmx512m -cp ./libs/*; com.l2jmega.geodataconverter.GeoDataConverter > log/stdout.log 2>&1

