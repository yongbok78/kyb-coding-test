def solution(phone_number)
  "*" * (phone_number.size - 4) << phone_number[-4..]
end

p solution "01033334444"
p solution "027778888"
