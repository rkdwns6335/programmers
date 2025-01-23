# [level 0] 문자열 바꿔서 찾기 - 181864 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181864) 

### 성능 요약

메모리: 79.6 MB, 시간: 2.43 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 23일 14:31:50

### 문제 설명

<p style="user-select: auto !important;">문자 "A"와 "B"로 이루어진 문자열 <code style="user-select: auto !important;">myString</code>과 <code style="user-select: auto !important;">pat</code>가 주어집니다. <code style="user-select: auto !important;">myString</code>의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중  <code style="user-select: auto !important;">pat</code>이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">myString</code>의 길이 ≤ 100</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">pat</code>의 길이 ≤ 10

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">myString</code>과 <code style="user-select: auto !important;">pat</code>는 문자 "A"와 "B"로만 이루어진 문자열입니다.</li>
</ul></li>
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
<td style="user-select: auto !important;">"ABBAA"</td>
<td style="user-select: auto !important;">"AABB"</td>
<td style="user-select: auto !important;">1</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"ABAB"</td>
<td style="user-select: auto !important;">"ABAB"</td>
<td style="user-select: auto !important;">0</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"ABBAA"에서 "A"와 "B"를 서로 바꾸면 "BAABB"입니다. 여기에는 부분문자열 "AABB"가 있기 때문에 1을 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">"ABAB"에서 "A"와 "B"를 서로 바꾸면 "BABA"입니다. 여기에는 부분문자열 "BABA"가 없기 때문에 0을 return 합니다.</li>
</ul>

<p style="user-select: auto !important;">※ 2023년 05월 15일 제한사항 및 테스트 케이스가 수정되었습니다. 기존에 제출한 코드가 통과하지 못할 수 있습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges