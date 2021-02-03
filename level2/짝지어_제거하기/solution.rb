def solution(s)
  stack = [s[0]]
  1.step(s.size - 1) do |i|
    if stack.last == s[i]
      stack.pop
    else
      stack << s[i]
    end
  end
  return stack.empty? ? 1 : 0
end

p solution "baabaa"
p solution "cdcd"
