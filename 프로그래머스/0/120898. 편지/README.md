# [level 0] 편지 - 120898 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120898) 

### 성능 요약

메모리: 77.1 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 02월 05일 13:51:14

### 문제 설명

<p style="user-select: auto !important;">머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다. 할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며, 편지를 가로로만 적을 때, 축하 문구 <code style="user-select: auto !important;">message</code>를 적기 위해 필요한 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">공백도 하나의 문자로 취급합니다.</li>
<li style="user-select: auto !important;">1 ≤ message의 길이 ≤ 50</li>
<li style="user-select: auto !important;">편지지의 여백은 생각하지 않습니다.</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">message</code>는 영문 알파벳 대소문자, ‘!’, ‘~’ 또는 공백으로만 이루어져 있습니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">message</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"happy birthday!"</td>
<td style="user-select: auto !important;">30</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"I love you~"</td>
<td style="user-select: auto !important;">22</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">message</code>의 글자 수가 15개로 최소 가로 30cm의 편지지가 필요합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">message</code>의 글자 수가 11개로 최소 가로 22cm의 편지지가 필요합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges