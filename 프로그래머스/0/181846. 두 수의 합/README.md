# [level 0] 두 수의 합 - 181846 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181846) 

### 성능 요약

메모리: 119 MB, 시간: 432.52 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 30일 14:50:04

### 문제 설명

<p style="user-select: auto !important;">0 이상의 두 정수가 <strong style="user-select: auto !important;">문자열</strong> <code style="user-select: auto !important;">a</code>, <code style="user-select: auto !important;">b</code>로 주어질 때, <code style="user-select: auto !important;">a</code> + <code style="user-select: auto !important;">b</code>의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">a</code>의 길이 ≤ 100,000</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">b</code>의 길이 ≤ 100,000</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">a</code>와 <code style="user-select: auto !important;">b</code>는 숫자로만 이루어져 있습니다.</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">a</code>와 <code style="user-select: auto !important;">b</code>는 정수 0이 아니라면 0으로 시작하지 않습니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">a</th>
<th style="user-select: auto !important;">b</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"582"</td>
<td style="user-select: auto !important;">"734"</td>
<td style="user-select: auto !important;">"1316"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"18446744073709551615"</td>
<td style="user-select: auto !important;">"287346502836570928366"</td>
<td style="user-select: auto !important;">"305793246910280479981"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"0"</td>
<td style="user-select: auto !important;">"0"</td>
<td style="user-select: auto !important;">"0"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 1번의 <code style="user-select: auto !important;">a</code>, <code style="user-select: auto !important;">b</code>는 각각 582, 734이고 582 + 734 = 1316입니다. 따라서 "1316"을 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 2번의 <code style="user-select: auto !important;">a</code>, <code style="user-select: auto !important;">b</code>는 각각 18446744073709551615, 287346502836570928366이고 18446744073709551615 + 287346502836570928366 = 305793246910280479981입니다. 따라서 "305793246910280479981"을 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #3</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 3번의 <code style="user-select: auto !important;">a</code>, <code style="user-select: auto !important;">b</code>는 각각 0, 0이고 0 + 0 = 0입니다. 따라서 "0"을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges