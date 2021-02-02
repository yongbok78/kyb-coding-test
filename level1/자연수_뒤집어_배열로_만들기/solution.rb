def solution(n)
  answer = []
  until n == 0
    answer << n % 10
    n /= 10
  end
  return answer
  # 다른 사람 풀이 보니 이런 것도 있네...
  # return n.digits
end

p solution 12345
