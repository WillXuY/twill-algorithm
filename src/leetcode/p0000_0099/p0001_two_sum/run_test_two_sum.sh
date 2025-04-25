#!/bin/bash

mvn test -Dtest=TwoSumTest#testTwoSum

pytest test_two_sum.py
