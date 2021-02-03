def solution(brown, yellow)
  total = brown + yellow
  sqrt = Math.sqrt(total)
  return [sqrt.to_i, sqrt.to_i] if sqrt == sqrt.to_i

  x = 0, y = 0
  sqrt.to_i.step(1, -1) do |i|
    if total % i == 0
      x = total / i
      y = i
      break if yellow == (x - 2) * (y - 2)
    end
  end
  return [x, y]
end

p solution 10, 2
p solution 8, 1
p solution 24, 24
