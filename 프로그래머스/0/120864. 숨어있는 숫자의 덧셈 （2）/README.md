# [level 0] 숨어있는 숫자의 덧셈 (2) - 120864 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120864) 

### 성능 요약

메모리: 79.9 MB, 시간: 0.13 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 03월 03일 16:41:38

### 문제 설명

<p style="user-select: auto !important;">문자열 <code style="user-select: auto !important;">my_string</code>이 매개변수로 주어집니다. <code style="user-select: auto !important;">my_string</code>은 소문자, 대문자, 자연수로만 구성되어있습니다. <code style="user-select: auto !important;">my_string</code>안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">my_string</code>의 길이 ≤ 1,000</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">my_string</code> 안의 자연수 ≤ 1000</li>
<li style="user-select: auto !important;">연속된 수는 하나의 숫자로 간주합니다.</li>
<li style="user-select: auto !important;">000123과 같이 0이 선행하는 경우는 없습니다.</li>
<li style="user-select: auto !important;">문자열에 자연수가 없는 경우 0을 return 해주세요.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">my_string</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"aAb1B2cC34oOp"</td>
<td style="user-select: auto !important;">37</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"1a2b3c4d123Z"</td>
<td style="user-select: auto !important;">133</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"aAb1B2cC34oOp"안의 자연수는 1, 2, 34 입니다. 따라서 1 + 2 + 34 = 37 을 return합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"1a2b3c4d123Z"안의 자연수는 1, 2, 3, 4, 123 입니다. 따라서 1 + 2 + 3 + 4 + 123 = 133 을 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges