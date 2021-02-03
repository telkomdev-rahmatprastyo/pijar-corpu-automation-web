#!/bin/bash

if [ -d "report" ]
then 
	 rm -rf report
	echo "Report successful delete"
else
	echo "Report is empty"
fi
