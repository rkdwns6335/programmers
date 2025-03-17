# [level 0] 커피 심부름 - 181837 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181837) 

### 성능 요약

메모리: 74.4 MB, 시간: 3.53 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 03월 17일 14:35:56

### 문제 설명

<p style="user-select: auto !important;">팀의 막내인 철수는 아메리카노와 카페 라테만 판매하는 카페에서 팀원들의 커피를 사려고 합니다. 아메리카노와 카페 라테의 가격은 차가운 것과 뜨거운 것 상관없이 각각 4500, 5000원입니다. 각 팀원에게 마실 메뉴를 적어달라고 하였고, 그 중에서 메뉴만 적은 팀원의 것은 차가운 것으로 통일하고 "아무거나"를 적은 팀원의 것은 차가운 아메리카노로 통일하기로 하였습니다.</p>

<p style="user-select: auto !important;">각 직원이 적은 메뉴가 문자열 배열 <code style="user-select: auto !important;">order</code>로 주어질 때, 카페에서 결제하게 될 금액을 return 하는 solution 함수를 작성해주세요. <code style="user-select: auto !important;">order</code>의 원소는 아래의 것들만 들어오고, 각각의 의미는 다음과 같습니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">order의 원소</th>
<th style="user-select: auto !important;">의미</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"iceamericano", "americanoice"</td>
<td style="user-select: auto !important;">차가운 아메리카노</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"hotamericano", "americanohot"</td>
<td style="user-select: auto !important;">따뜻한 아메리카노</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"icecafelatte", "cafelatteice"</td>
<td style="user-select: auto !important;">차가운 카페 라테</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"hotcafelatte", "cafelattehot"</td>
<td style="user-select: auto !important;">따뜻한 카페 라테</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"americano"</td>
<td style="user-select: auto !important;">아메리카노</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"cafelatte"</td>
<td style="user-select: auto !important;">카페 라테</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"anything"</td>
<td style="user-select: auto !important;">아무거나</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">order</code>의 길이 ≤ 1,000</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">order</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">["cafelatte", "americanoice", "hotcafelatte", "anything"]</td>
<td style="user-select: auto !important;">19000</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">["americanoice", "americano", "iceamericano"]</td>
<td style="user-select: auto !important;">13500</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 1번의 입력을 표로 나타내면 다음과 같습니다.</li>
</ul>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">order[i]</th>
<th style="user-select: auto !important;">팀원의 적은 음료</th>
<th style="user-select: auto !important;">실제 주문 음료</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"cafelatte"</td>
<td style="user-select: auto !important;">카페 라테</td>
<td style="user-select: auto !important;">차가운 카페 라테</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"americanoice"</td>
<td style="user-select: auto !important;">차가운 아메리카노</td>
<td style="user-select: auto !important;">차가운 아메리카노</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"hotcafelatte"</td>
<td style="user-select: auto !important;">따뜻한 카페 라테</td>
<td style="user-select: auto !important;">따뜻한 카페 라테</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"anything"</td>
<td style="user-select: auto !important;">아무거나</td>
<td style="user-select: auto !important;">차가운 아메리카노</td>
</tr>
</tbody>
      </table><div class="highlight" style="user-select: auto !important;"><pre class="codehilite" style="user-select: auto !important;"><code style="user-select: auto !important;">철수는 차가운 아메리카노 2잔, 차가운 카페 라테 1잔, 따뜻한 카페 라테 1잔을 주문하게 되므로 결제 금액은 4500 &amp;times; 2 + 5000 &amp;times; 2 = 19000원입니다. 따라서 19000을 return 합니다.
</code></pre></div>
<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">예제 2번의 입력에서는 모든 음료를 차가운 아메리카노로 시키게 됩니다. 따라서 결제 금액은 4500 × 3 = 13500원이고 13500을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges