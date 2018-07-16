#!/bin/bash
if [ $# -eq 1 ]; then
	USER=$1
else
	USER=popi
fi
echo "Mysql user: $USER"
mysql -u $USER -p --local-infile=1  jimmydb < select.sql
mysql -u $USER -p jimmydb -e "SELECT * FROM auction_user"
