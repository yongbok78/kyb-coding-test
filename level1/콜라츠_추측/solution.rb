def solution(num)
  answer = 0
  until num == 1
    num = num.even? ? num / 2 : num * 3 + 1
    answer += 1
    if answer == 500
      answer = -1
      break
    end
  end
  return answer
end

p solution 6
p solution 16
p solution 626331
