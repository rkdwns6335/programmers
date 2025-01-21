# [level 0] 등차수열의 특정한 항만 더하기 - 181931 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181931) 

### 성능 요약

메모리: 87.7 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 21일 15:23:43

### 문제 설명

<p style="user-select: auto !important;">두 정수 <code style="user-select: auto !important;">a</code>, <code style="user-select: auto !important;">d</code>와 길이가 n인 boolean 배열 <code style="user-select: auto !important;">included</code>가 주어집니다. 첫째항이 <code style="user-select: auto !important;">a</code>, 공차가 <code style="user-select: auto !important;">d</code>인 등차수열에서 <code style="user-select: auto !important;">included[i]</code>가 i + 1항을 의미할 때, 이 등차수열의 1항부터 n항까지 <code style="user-select: auto !important;">included</code>가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">a</code> ≤ 100</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">d</code> ≤ 100</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">included</code>의 길이 ≤ 100</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">included</code>에는 true가 적어도 하나 존재합니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">a</th>
<th style="user-select: auto !important;">d</th>
<th style="user-select: auto !important;">included</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">[true, false, false, true, true]</td>
<td style="user-select: auto !important;">37</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">7</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">[false, false, false, true, false, false, false]</td>
<td style="user-select: auto !important;">10</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 1번은 <code style="user-select: auto !important;">a</code>와 <code style="user-select: auto !important;">d</code>가 각각 3, 4이고 <code style="user-select: auto !important;">included</code>의 길이가 5입니다. 이를 표로 나타내면 다음과 같습니다.</li>
</ul>

<p style="user-select: auto !important;">||1항|2항|3항|4항|5항|</p>

<p style="user-select: auto !important;">|-|-|---|---|---|---|</p>

<p style="user-select: auto !important;">|등차수열|3|7|11|15|19|</p>

<p style="user-select: auto !important;">|included|true|false|false|true|true|</p>
<div class="highlight" style="user-select: auto !important;"><pre class="codehilite" style="user-select: auto !important;"><code style="user-select: auto !important;">따라서 true에 해당하는 1항, 4항, 5항을 더한 3 + 15 + 19 = 37을 return 합니다.
</code></pre></div>
<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 2번은 <code style="user-select: auto !important;">a</code>와 <code style="user-select: auto !important;">d</code>가 각각 7, 1이고 <code style="user-select: auto !important;">included</code>의 길이가 7입니다. 이를 표로 나타내면 다음과 같습니다.</li>
</ul>

<p style="user-select: auto !important;">||1항|2항|3항|4항|5항|6항|7항|</p>

<p style="user-select: auto !important;">|-|-|---|---|---|---|---|---|</p>

<p style="user-select: auto !important;">|등차수열|7|8|9|10|11|12|13|</p>

<p style="user-select: auto !important;">|included|false|false|false|true|false|false|false|</p>
<div class="highlight" style="user-select: auto !important;"><pre class="codehilite" style="user-select: auto !important;"><code style="user-select: auto !important;">따라서 4항만 true이므로 10을 return 합니다.
</code></pre></div>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges