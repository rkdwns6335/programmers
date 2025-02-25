# [level 0] 가장 큰 수 찾기 - 120899 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120899) 

### 성능 요약

메모리: 84.2 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 02월 25일 18:19:06

### 문제 설명

<p style="user-select: auto !important;">정수 배열 <code style="user-select: auto !important;">array</code>가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">array의</code> 길이 ≤ 100</li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">array</code> 원소 ≤ 1,000</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">array</code>에 중복된 숫자는 없습니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">array</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1, 8, 3]</td>
<td style="user-select: auto !important;">[8, 1]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[9, 10, 11, 8]</td>
<td style="user-select: auto !important;">[11, 2]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1, 8, 3 중 가장 큰 수는 8이고 인덱스 1에 있습니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">9, 10, 11, 8 중 가장 큰 수는 11이고 인덱스 2에 있습니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges