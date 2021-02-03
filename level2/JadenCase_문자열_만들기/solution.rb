def solution(s)
  answer = s[0].upcase
  1.step(s.size - 1) do |i|
    if s[i - 1] == " "
      answer += s[i].upcase
    else
      answer += s[i].downcase
    end
  end
  return answer
end

p solution "3people unFollowed me"
p solution "for the last week"
