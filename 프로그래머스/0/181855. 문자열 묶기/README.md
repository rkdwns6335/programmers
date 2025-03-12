# [level 0] 문자열 묶기 - 181855 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181855) 

### 성능 요약

메모리: 128 MB, 시간: 6.55 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 03월 12일 16:04:18

### 문제 설명

<p style="user-select: auto !important;">문자열 배열 <code style="user-select: auto !important;">strArr</code>이 주어집니다. <code style="user-select: auto !important;">strArr</code>의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">strArr</code>의 길이 ≤ 100,000

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">strArr</code>의 원소의 길이 ≤ 30</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">strArr</code>의 원소들은 알파벳 소문자로 이루어진 문자열입니다.</li>
</ul></li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">strArr</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">["a","bc","d","efg","hi"]</td>
<td style="user-select: auto !important;">2</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #1</strong></p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">각 문자열들을 길이에 맞게 그룹으로 묶으면 다음과 같습니다.</li>
</ul>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">문자열 길이</th>
<th style="user-select: auto !important;">문자열 목록</th>
<th style="user-select: auto !important;">개수</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">["a","d"]</td>
<td style="user-select: auto !important;">2</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">["bc","hi"]</td>
<td style="user-select: auto !important;">2</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">["efg"]</td>
<td style="user-select: auto !important;">1</td>
</tr>
</tbody>
      </table>
<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">개수의 최댓값은 2이므로 2를 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges