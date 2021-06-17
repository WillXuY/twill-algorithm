# Climbing Stair ideas
Example n = 6, 7

## Idea 2
1. List add the combination of steps.
2. Permutation with repetition [Search for help](https://brilliant.org/wiki/permutations-with-repetition/)

$$
\frac{n!}{n_1!n_2!n_3!\cdots n_k!}
$$

### in this case: 
- n = input - n2
- n1 = input - n2 * 2

$$
\frac{(n - n_2)!}{n_2!\times (n - n_2 * 2)!}
$$

### n = 6

- 111111

$$ \frac{6!}{6!} = 1 $$

- 21111
  - 12111
  - 11211
  - 11121
  - 11112
  
$$ \frac{5!}{1!\times 4!} = 5 $$

- 2211
  - 2121
    - 1221
  - 2112
    - 1212
    - 1122
    
$$ \frac{4!}{2!\times 2!} = 6 $$

- 222

$$ \frac{3!}{3!} = 1 $$

### n = 7

- 1111111

$$ \frac{7!}{7!} = 1 $$

- 211111
  - 121111
  - 112111
  - 111211
  - 111121
  - 111112

$$ \frac{6!}{1!\times 5!} = 6 $$

- 22111
  - 21211
    - 12211
  - 21121
    - 12121
    - 11221
  - 21112
    - 12112
    - 11212
    - 11122

$$ \frac{5!}{2!\times 3!} = 10 $$

- 2221
  - 2212
  - 2122
  - 1222

$$ \frac{4!}{1!\times 3!} = 4 $$

## Idea 1
start at all steps are 1 and change 2 1-step to 2 steps step by step.

### Wrong: there are lots of same ways.

### n = 6

- 111111
  - 21111
    - 2211
      - 222
    - 2121
    - 2112
  - 12111
  - 11211
    - 2211
      - 222
  - 11121
  - 11112
    - 2112
      - 222
