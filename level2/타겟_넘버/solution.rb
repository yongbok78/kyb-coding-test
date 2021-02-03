def solution(numbers, target)
  answer = dfs(numbers, 0, 0, target)
  return answer
end

def dfs(numbers, depth, sum, target)
  if depth == numbers.size
    return 1 if sum == target
    return 0
  end

  return dfs(numbers, depth + 1, sum + numbers[depth], target) + dfs(numbers, depth + 1, sum - numbers[depth], target)
end

# 다른 사람 풀이
def solution2(numbers, target)
  if numbers.empty?
    target.zero? ? 1 : 0
  else
    value = numbers.shift
    solution(numbers.dup, target + value) + solution(numbers.dup, target - value)
  end
end

p solution [1, 1, 1, 1, 1], 3
