# [level 0] 문자열의 뒤의 n글자 - 181910 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181910) 

### 성능 요약

메모리: 81.7 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 28일 17:09:08

### 문제 설명

<p style="user-select: auto !important;">문자열 <code style="user-select: auto !important;">my_string</code>과 정수 <code style="user-select: auto !important;">n</code>이 매개변수로 주어질 때, <code style="user-select: auto !important;">my_string</code>의 뒤의 <code style="user-select: auto !important;">n</code>글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">my_string</code>은 숫자와 알파벳으로 이루어져 있습니다.</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">my_string</code>의 길이 ≤ 1,000</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">n</code> ≤ <code style="user-select: auto !important;">my_string</code>의 길이</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">my_string</th>
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"ProgrammerS123"</td>
<td style="user-select: auto !important;">11</td>
<td style="user-select: auto !important;">"grammerS123"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"He110W0r1d"</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">"W0r1d"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 1번의 <code style="user-select: auto !important;">my_string</code>에서 뒤의 11글자는 "grammerS123"이므로 이 문자열을 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 2번의 <code style="user-select: auto !important;">my_string</code>에서 뒤의 5글자는 "W0r1d"이므로 이 문자열을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges