@echo off
title aCis geodata converter

java -Xmx512m -cp ./libs/*; com.l2jmega.geodataconverter.GeoDataConverter

pause
