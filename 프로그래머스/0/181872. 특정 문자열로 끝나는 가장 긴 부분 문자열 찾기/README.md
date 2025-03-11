# [level 0] 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기 - 181872 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181872) 

### 성능 요약

메모리: 81.9 MB, 시간: 0.07 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 03월 11일 16:05:13

### 문제 설명

<p style="user-select: auto !important;">문자열 <code style="user-select: auto !important;">myString</code>과 <code style="user-select: auto !important;">pat</code>가 주어집니다. <code style="user-select: auto !important;">myString</code>의 부분 문자열중 <code style="user-select: auto !important;">pat</code>로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">5 ≤ <code style="user-select: auto !important;">myString</code> ≤ 20</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">pat</code> ≤ 5

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">pat</code>은 반드시 <code style="user-select: auto !important;">myString</code>의 부분 문자열로 주어집니다.</li>
</ul></li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">myString</code>과 <code style="user-select: auto !important;">pat</code>에 등장하는 알파벳은 대문자와 소문자를 구분합니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">myString</th>
<th style="user-select: auto !important;">pat</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"AbCdEFG"</td>
<td style="user-select: auto !important;">"dE"</td>
<td style="user-select: auto !important;">"AbCdE"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"AAAAaaaa"</td>
<td style="user-select: auto !important;">"a"</td>
<td style="user-select: auto !important;">"AAAAaaaa"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"AbCdEFG"에서 "dE"는 한 번 등장하며 처음부터 해당 위치까지 잘라내면 "AbCdE"가 됩니다. 따라서 이 문자열이 "dE"로 끝나는 가장 긴 문자열이며, "AbCdE"를 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"AAAAaaaa"에서 "a"는 총 네 번 등장하며 이 중 가장 마지막에 있는 위치까지 잘라내면 "AAAAaaaa"가 됩니다. 따라서 이 문자열이 "a"로 끝나는 가장 긴 문자열이며, "AAAAaaaa"를 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges