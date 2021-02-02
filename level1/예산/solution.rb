def solution(d, budget)
  answer = 0
  d.sort.each do |bg|
    if bg <= budget
      budget -= bg
      answer += 1
    else
      break
    end
  end
  return answer
end

p solution [1, 3, 2, 5, 4], 9
p solution [2, 2, 3, 3], 10
