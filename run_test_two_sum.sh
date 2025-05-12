#!/bin/bash

# run at project root. need pom.xml
mvn test -Dtest=TwoSumTest#testTwoSum

# can run at the same floder with test.py
pytest test_two_sum.py
