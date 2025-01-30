# [level 0] 수열과 구간 쿼리 2 - 181923 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181923) 

### 성능 요약

메모리: 87.1 MB, 시간: 2.47 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 01월 30일 14:51:18

### 문제 설명

<p style="user-select: auto !important;">정수 배열 <code style="user-select: auto !important;">arr</code>와 2차원 정수 배열 <code style="user-select: auto !important;">queries</code>이 주어집니다. <code style="user-select: auto !important;">queries</code>의 원소는 각각 하나의 <code style="user-select: auto !important;">query</code>를 나타내며, <code style="user-select: auto !important;">[s, e, k]</code> 꼴입니다.</p>

<p style="user-select: auto !important;">각 <code style="user-select: auto !important;">query</code>마다 순서대로 <code style="user-select: auto !important;">s</code> ≤ <code style="user-select: auto !important;">i</code> ≤ <code style="user-select: auto !important;">e</code>인 모든 <code style="user-select: auto !important;">i</code>에 대해 <code style="user-select: auto !important;">k</code>보다 크면서 가장 작은 <code style="user-select: auto !important;">arr[i]</code>를 찾습니다.</p>

<p style="user-select: auto !important;">각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.<br style="user-select: auto !important;">
단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">arr</code>의 길이 ≤ 1,000

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">arr</code>의 원소 ≤ 1,000,000</li>
</ul></li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">queries</code>의 길이 ≤ 1,000

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">s</code> ≤ <code style="user-select: auto !important;">e</code> &lt; <code style="user-select: auto !important;">arr</code>의 길이</li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">k</code> ≤ 1,000,000</li>
</ul></li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">arr</th>
<th style="user-select: auto !important;">queries</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[0, 1, 2, 4, 3]</td>
<td style="user-select: auto !important;">[[0, 4, 2],[0, 3, 2],[0, 2, 2]]</td>
<td style="user-select: auto !important;">[3, 4, -1]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">첫 번째 쿼리의 범위에는 0, 1, 2, 4, 3이 있으며 이 중 2보다 크면서 가장 작은 값은 3입니다.</li>
<li style="user-select: auto !important;">두 번째 쿼리의 범위에는 0, 1, 2, 4가 있으며 이 중 2보다 크면서 가장 작은 값은 4입니다.</li>
<li style="user-select: auto !important;">세 번째 쿼리의 범위에는 0, 1, 2가 있으며 여기에는 2보다 큰 값이 없습니다.</li>
<li style="user-select: auto !important;">따라서 [3, 4, -1]을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges