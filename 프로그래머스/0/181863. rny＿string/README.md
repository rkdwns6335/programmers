# [level 0] rny_string - 181863 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181863) 

### 성능 요약

메모리: 88 MB, 시간: 20.50 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 23일 14:26:11

### 문제 설명

<p style="user-select: auto !important;">'m'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 문자열 <code style="user-select: auto !important;">rny_string</code>이 주어질 때, <code style="user-select: auto !important;">rny_string</code>의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">rny_string</code>의 길이 ≤ 100</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">rny_string</code>은 영소문자로만 이루어져 있습니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">rny_string</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"masterpiece"</td>
<td style="user-select: auto !important;">"rnasterpiece"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"programmers"</td>
<td style="user-select: auto !important;">"prograrnrners"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"jerry"</td>
<td style="user-select: auto !important;">"jerry"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"burn"</td>
<td style="user-select: auto !important;">"burn"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 1번의 <code style="user-select: auto !important;">rny_string</code>의 'm'을 "rn"으로 바꾸는 과정을 표로 나타내면 다음과 같습니다.</li>
</ul>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">rny_string</th>
<th style="user-select: auto !important;">m</th>
<th style="user-select: auto !important;">a</th>
<th style="user-select: auto !important;">s</th>
<th style="user-select: auto !important;">t</th>
<th style="user-select: auto !important;">e</th>
<th style="user-select: auto !important;">r</th>
<th style="user-select: auto !important;">p</th>
<th style="user-select: auto !important;">i</th>
<th style="user-select: auto !important;">e</th>
<th style="user-select: auto !important;">c</th>
<th style="user-select: auto !important;">e</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">result</td>
<td style="user-select: auto !important;">rn</td>
<td style="user-select: auto !important;">a</td>
<td style="user-select: auto !important;">s</td>
<td style="user-select: auto !important;">t</td>
<td style="user-select: auto !important;">e</td>
<td style="user-select: auto !important;">r</td>
<td style="user-select: auto !important;">p</td>
<td style="user-select: auto !important;">i</td>
<td style="user-select: auto !important;">e</td>
<td style="user-select: auto !important;">c</td>
<td style="user-select: auto !important;">e</td>
</tr>
</tbody>
      </table><div class="highlight" style="user-select: auto !important;"><pre class="codehilite" style="user-select: auto !important;"><code style="user-select: auto !important;">따라서 "rnasterpiece"를 return 합니다.
</code></pre></div>
<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 2번의 <code style="user-select: auto !important;">rny_string</code>의 'm'을 "rn"으로 바꾸는 과정을 표로 나타내면 다음과 같습니다.</li>
</ul>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">rny_string</th>
<th style="user-select: auto !important;">p</th>
<th style="user-select: auto !important;">r</th>
<th style="user-select: auto !important;">o</th>
<th style="user-select: auto !important;">g</th>
<th style="user-select: auto !important;">r</th>
<th style="user-select: auto !important;">a</th>
<th style="user-select: auto !important;">m</th>
<th style="user-select: auto !important;">m</th>
<th style="user-select: auto !important;">e</th>
<th style="user-select: auto !important;">r</th>
<th style="user-select: auto !important;">s</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">result</td>
<td style="user-select: auto !important;">p</td>
<td style="user-select: auto !important;">r</td>
<td style="user-select: auto !important;">o</td>
<td style="user-select: auto !important;">g</td>
<td style="user-select: auto !important;">r</td>
<td style="user-select: auto !important;">a</td>
<td style="user-select: auto !important;">rn</td>
<td style="user-select: auto !important;">rn</td>
<td style="user-select: auto !important;">e</td>
<td style="user-select: auto !important;">r</td>
<td style="user-select: auto !important;">s</td>
</tr>
</tbody>
      </table><div class="highlight" style="user-select: auto !important;"><pre class="codehilite" style="user-select: auto !important;"><code style="user-select: auto !important;">따라서 "prograrnrners"를 return 합니다.
</code></pre></div>
<p style="user-select: auto !important;">입출력 예 #3</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 3번의 <code style="user-select: auto !important;">rny_string</code>에는 'm'이 없습니다. 따라서 <code style="user-select: auto !important;">rny_string</code> 그대로인 "jerry"를 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #4</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 4번의 <code style="user-select: auto !important;">rny_string</code>에는 'm'이 없습니다. 따라서 <code style="user-select: auto !important;">rny_string</code> 그대로인 "burn"를 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges