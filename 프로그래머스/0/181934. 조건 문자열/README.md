# [level 0] 조건 문자열 - 181934 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181934) 

### 성능 요약

메모리: 86.3 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 20일 16:49:01

### 문제 설명

<p style="user-select: auto !important;">문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.  </p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">두 수가 <code style="user-select: auto !important;">n</code>과 <code style="user-select: auto !important;">m</code>이라면

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"&gt;", "=" : <code style="user-select: auto !important;">n</code> &gt;= <code style="user-select: auto !important;">m</code></li>
<li style="user-select: auto !important;">"&lt;", "=" : <code style="user-select: auto !important;">n</code> &lt;= <code style="user-select: auto !important;">m</code></li>
<li style="user-select: auto !important;">"&gt;", "!" : <code style="user-select: auto !important;">n</code> &gt; <code style="user-select: auto !important;">m</code></li>
<li style="user-select: auto !important;">"&lt;", "!" : <code style="user-select: auto !important;">n</code> &lt; <code style="user-select: auto !important;">m</code> </li>
</ul></li>
</ul>

<p style="user-select: auto !important;">두 문자열 <code style="user-select: auto !important;">ineq</code>와 <code style="user-select: auto !important;">eq</code>가 주어집니다. <code style="user-select: auto !important;">ineq</code>는 "&lt;"와 "&gt;"중 하나고, <code style="user-select: auto !important;">eq</code>는 "="와 "!"중 하나입니다. 그리고 두 정수 <code style="user-select: auto !important;">n</code>과 <code style="user-select: auto !important;">m</code>이 주어질 때, <code style="user-select: auto !important;">n</code>과 <code style="user-select: auto !important;">m</code>이 <code style="user-select: auto !important;">ineq</code>와 <code style="user-select: auto !important;">eq</code>의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한 사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">n</code>, <code style="user-select: auto !important;">m</code> ≤ 100</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">ineq</th>
<th style="user-select: auto !important;">eq</th>
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">m</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"&lt;"</td>
<td style="user-select: auto !important;">"="</td>
<td style="user-select: auto !important;">20</td>
<td style="user-select: auto !important;">50</td>
<td style="user-select: auto !important;">1</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"&gt;"</td>
<td style="user-select: auto !important;">"!"</td>
<td style="user-select: auto !important;">41</td>
<td style="user-select: auto !important;">78</td>
<td style="user-select: auto !important;">0</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">20 &lt;= 50은 참이기 때문에 1을 return합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">41 &gt; 78은 거짓이기 때문에 0을 return합니다.</li>
</ul>

<hr style="user-select: auto !important;">

<p style="user-select: auto !important;">※ 2023.05.31 테스트 케이스가 수정되었습니다. 기존에 제출한 코드가 통과하지 못할 수도 있습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges