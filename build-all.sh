#!/bin/bash
cd time-source && mvn clean package && cp target/*.jar ../shell
cd ../time-processor && mvn clean package && cp target/*.jar ../shell
cd ../time-to-log && mvn clean package && cp target/*.jar ../shell
cd ..

