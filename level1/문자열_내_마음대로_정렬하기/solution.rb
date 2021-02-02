def solution(strings, n)
  answer = strings.sort { |a, b|
    v = a[n] <=> b[n]
    v.zero? ? a <=> b : v
  }
  return answer
end

p solution ["sun", "bed", "car"], 1
p solution ["abce", "abcd", "cdx"], 2
