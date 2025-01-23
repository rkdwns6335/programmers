# [level 0] ad 제거하기 - 181870 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181870) 

### 성능 요약

메모리: 89.3 MB, 시간: 0.92 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 23일 18:22:04

### 문제 설명

<p style="user-select: auto !important;">문자열 배열 <code style="user-select: auto !important;">strArr</code>가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">strArr</code>의 길이 ≤ 1,000

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">strArr</code>의 원소의 길이 ≤ 20</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">strArr</code>의 원소는 알파벳 소문자로 이루어진 문자열입니다.</li>
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
<td style="user-select: auto !important;">["and","notad","abcd"]</td>
<td style="user-select: auto !important;">["and","abcd"]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">["there","are","no","a","ds"]</td>
<td style="user-select: auto !important;">["there","are","no","a","ds"]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1번 인덱스의 문자열인 "notad"는 부분 문자열로 "ad"를 가집니다. 따라서 해당 문자열을 제거하고 나머지는 순서를 유지하여 ["and","abcd"]를 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"ad"가 부분 문자열로 들어간 문자열이 존재하지 않습니다. 따라서 원래 배열을 그대로 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges