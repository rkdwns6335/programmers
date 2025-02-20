# [level 0] 조건에 맞게 수열 변환하기 3 - 181835 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181835) 

### 성능 요약

메모리: 177 MB, 시간: 6.92 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 02월 20일 18:21:31

### 문제 설명

<p style="user-select: auto !important;">정수 배열 <code style="user-select: auto !important;">arr</code>와 자연수 <code style="user-select: auto !important;">k</code>가 주어집니다. </p>

<p style="user-select: auto !important;">만약 <code style="user-select: auto !important;">k</code>가 홀수라면 <code style="user-select: auto !important;">arr</code>의 모든 원소에 <code style="user-select: auto !important;">k</code>를 곱하고, <code style="user-select: auto !important;">k</code>가 짝수라면 <code style="user-select: auto !important;">arr</code>의 모든 원소에 <code style="user-select: auto !important;">k</code>를 더합니다.</p>

<p style="user-select: auto !important;">이러한 변환을 마친 후의 <code style="user-select: auto !important;">arr</code>를 return 하는 solution 함수를 완성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">arr</code>의 길이 ≤ 1,000,000

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">arr</code>의 원소의 값 ≤ 100</li>
</ul></li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">k</code> ≤ 100</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">arr</th>
<th style="user-select: auto !important;">k</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1, 2, 3, 100, 99, 98]</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">[3, 6, 9, 300, 297, 294]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1, 2, 3, 100, 99, 98]</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">[3, 4, 5, 102, 101, 100]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">주어진 <code style="user-select: auto !important;">k</code>인 3은 홀수이므로, 전체 배열에 3을 곱합니다. 따라서 [3, 6, 9, 300, 297, 294]을 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">주어진 <code style="user-select: auto !important;">k</code>인 2는 짝수이므로, 전체 배열에 2를 더합니다. 따라서 [3, 4, 5, 102, 101, 100]을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges