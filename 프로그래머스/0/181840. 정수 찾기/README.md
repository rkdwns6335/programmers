# [level 0] 정수 찾기 - 181840 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181840) 

### 성능 요약

메모리: 90.5 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 02월 20일 18:30:46

### 문제 설명

<p style="user-select: auto !important;">정수 리스트 <code style="user-select: auto !important;">num_list</code>와 찾으려는 정수 <code style="user-select: auto !important;">n</code>이 주어질 때, <code style="user-select: auto !important;">num_list</code>안에 <code style="user-select: auto !important;">n</code>이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">3 ≤ <code style="user-select: auto !important;">num_list</code>의 길이 ≤ 100</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">num_list</code>의 원소 ≤ 100</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">n</code> ≤ 100</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">num_list</th>
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1, 2, 3, 4, 5]</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">1</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[15, 98, 23, 2, 15]</td>
<td style="user-select: auto !important;">20</td>
<td style="user-select: auto !important;">0</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">[1, 2, 3, 4, 5] 안에 3이 있으므로 1을 return합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">[15, 98, 23, 2, 15] 안에 20이 없으므로 0을 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges