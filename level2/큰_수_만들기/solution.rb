def solution(number, k)
  stack = []

  number.chars.each do |n|
    while !stack.empty? && stack.last < n && k > 0
      stack.pop
      k -= 1
    end
    stack << n
  end

  answer = stack[0...(number.size - k)].join
  return answer
end

p solution "1924", 2
p solution "1231234", 3
p solution "4177252841", 4
p solution "9999999999", 4
