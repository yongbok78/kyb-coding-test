def solution(a, b)
  answer = Time.new(2016, a, b).strftime("%A")[0, 3].upcase
  return answer
end

p solution 5, 24
