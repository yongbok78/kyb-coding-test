def solution(s, n)
  answer = ""

  s.each_byte do |c|
    if c.chr != " "
      if c + n > "z".ord
        answer += (c + n + ("a".ord - "z".ord) - 1).chr
      elsif c + n > "Z".ord and ("A".ord <= c and c <= "Z".ord)
        answer += (c + n + ("A".ord - "Z".ord) - 1).chr
      else
        answer += (c + n).chr
      end
    else
      answer += c.chr
    end
  end
  return answer
end

p solution "AB", 1
p solution "z", 1
p solution "a B z", 4
