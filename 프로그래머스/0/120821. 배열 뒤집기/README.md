# [level 0] 배열 뒤집기 - 120821 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120821) 

### 성능 요약

메모리: 90.4 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 02월 05일 13:47:47

### 문제 설명

<p style="user-select: auto !important;">정수가 들어 있는 배열 <code style="user-select: auto !important;">num_list</code>가 매개변수로 주어집니다. <code style="user-select: auto !important;">num_list</code>의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">num_list</code>의 길이 ≤ 1,000</li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">num_list</code>의 원소 ≤ 1,000</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">num_list</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1, 2, 3, 4, 5]</td>
<td style="user-select: auto !important;">[5, 4, 3, 2, 1]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1, 1, 1, 1, 1, 2]</td>
<td style="user-select: auto !important;">[2, 1, 1, 1, 1, 1]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1, 0, 1, 1, 1, 3, 5]</td>
<td style="user-select: auto !important;">[5, 3, 1, 1, 1, 0, 1]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">num_list</code>가 [1, 2, 3, 4, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 4, 3, 2, 1]을 return합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">num_list</code>가 [1, 1, 1, 1, 1, 2]이므로 순서를 거꾸로 뒤집은 배열 [2, 1, 1, 1, 1, 1]을 return합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #3</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">num_list</code>가 [1, 0, 1, 1, 1, 3, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 3, 1, 1, 1, 0, 1]을 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges