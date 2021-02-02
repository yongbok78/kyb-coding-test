def solution(s)
  answer = ""
  odd = true
  s.chars.each do |c|
    if c == " "
      odd = true
      answer += c
    else
      answer += odd ? c.upcase : c.downcase
      odd = !odd
    end
  end
  return answer
end

p solution "try hello world"
