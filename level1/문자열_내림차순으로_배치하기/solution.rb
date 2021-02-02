def solution(s)
  answer = s.chars.sort { |a, b|
    if (a.between?("a", "z") and b.between?("A", "Z"))
      -1
    elsif (a.between?("A", "Z") and b.between?("a", "z"))
      1
    else
      b <=> a
    end
  }.join
  return answer
end

p solution "Zbcdefg"
