# [level 0] 카운트 다운 - 181899 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181899) 

### 성능 요약

메모리: 68.2 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 28일 16:50:14

### 문제 설명

<p style="user-select: auto !important;">정수 <code style="user-select: auto !important;">start_num</code>와 <code style="user-select: auto !important;">end_num</code>가 주어질 때, <code style="user-select: auto !important;">start_num</code>에서 <code style="user-select: auto !important;">end_num</code>까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">end_num</code> ≤ <code style="user-select: auto !important;">start_num</code> ≤ 50</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">start_num</th>
<th style="user-select: auto !important;">end_num</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">[10, 9, 8, 7, 6, 5, 4, 3]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">10부터 3까지 1씩 감소하는 수를 담은 리스트는 [10, 9, 8, 7, 6, 5, 4, 3]입니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges